计算器文档
功能描述:
1.支持浮点数输入，支持前导零及非前导零输入。若为非前导，提示为非标准输入.
2.支持四则运算，括号运算，幂次运算(2**3表示2的3次方）和ln运算(ln(10)).
3.支持加减<乘除<幂次<括号的优先级判别
4.支持多行式子、也可以一行多个式子，每个运算后面需要以等号结尾。不同式子之间以若干回车、空格或分号间隔。
5.支持变量运算。目前只支持52个大小写字母作为变量进行运算。

样例如下:
3+00.14=
WARNING: 00.14 unstandard input
result: 3.140000
a=3; a/2.5=
define: a = 3.000000
result: 1.200000
0.3*(5+2.3/4**2)=
result: 1.543125
A=0.34*ln(12.4); b=3*(1-0.3); A+b=
define: A = 0.856017
define: b = 2.100000
result: 2.956017
Abc=1
WARNING: Do not support multiletter input
syntax error

程序说明
1.lex部分:
    lex负责词法分析，读入输入的表达式，逐个分析每个成分的token，并把值存入yylval。因此定义yylval为double类型。其次定义了每个token的正则规则，特别地定义了标准实数和非前导实数，52个变量以及分隔符（空格、回车或分号）。如果输入的变量不是52个单独字母，会报错误。识别后返回token类型给yacc。
2.yacc部分：
    yacc负责语法分析。result为一个表达式的样式
    cmd: result | result DELIM cmd表示支持多行输入的式子
    按照加减<乘除<幂次<括号定义四个运算层级的语法树
    利用52位数组记录变量信息。定义一个变量ser。如果lex返回token为VAR的词素，会同时标记ser记录这是哪一个变量，随即修改对应数组值。