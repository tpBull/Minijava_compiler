//
// Generated by JTB 1.3.2
//

package kanga_syntaxtree;

/**
 * Grammar production:
 * f0 -> "LT"
 *       | "PLUS"
 *       | "MINUS"
 *       | "TIMES"
 */
public class Operator implements Node {
   public NodeChoice f0;

   public Operator(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(kanga_visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(kanga_visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(kanga_visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(kanga_visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

