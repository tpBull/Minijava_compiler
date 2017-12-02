//
// Generated by JTB 1.3.2
//

package minijava_syntaxtree;

import minijava_syntaxtree.Node;
import minijava_syntaxtree.NodeChoice;

/**
 * Grammar production:
 * f0 -> ArrayType()
 *       | BooleanType()
 *       | IntegerType()
 *       | Identifier()
 */
public class Type implements Node {
   public NodeChoice f0;

   public Type(NodeChoice n0) {
      f0 = n0;
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

