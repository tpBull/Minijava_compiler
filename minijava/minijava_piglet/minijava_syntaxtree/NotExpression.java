//
// Generated by JTB 1.3.2
//

package minijava_syntaxtree;

import minijava_syntaxtree.Node;
import minijava_syntaxtree.NodeToken;

/**
 * Grammar production:
 * f0 -> "!"
 * f1 -> Expression()
 */
public class NotExpression implements Node {
   public NodeToken f0;
   public Expression f1;

   public NotExpression(NodeToken n0, Expression n1) {
      f0 = n0;
      f1 = n1;
   }

   public NotExpression(Expression n0) {
      f0 = new NodeToken("!");
      f1 = n0;
   }

   public void accept(minijava_visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(minijava_visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(minijava_visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(minijava_visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

