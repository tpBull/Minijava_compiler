//
// Generated by JTB 1.3.2
//

package minijava_syntaxtree;

import minijava_syntaxtree.Node;
import minijava_syntaxtree.NodeToken;

/**
 * Grammar production:
 * f0 -> PrimaryExpression()
 * f1 -> "+"
 * f2 -> PrimaryExpression()
 */
public class CalculateExpression implements Node {
   public PrimaryExpression f0;
   public NodeToken f1;
   public PrimaryExpression f2;

   public CalculateExpression(PrimaryExpression n0, NodeToken n1, PrimaryExpression n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
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

