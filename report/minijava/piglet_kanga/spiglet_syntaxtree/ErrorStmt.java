//
// Generated by JTB 1.3.2
//

package spiglet_syntaxtree;

import spiglet_syntaxtree.Node;
import spiglet_syntaxtree.NodeToken;

/**
 * Grammar production:
 * f0 -> "ERROR"
 */
public class ErrorStmt implements Node {
   public NodeToken f0;

   public ErrorStmt(NodeToken n0) {
      f0 = n0;
   }

   public ErrorStmt() {
      f0 = new NodeToken("ERROR");
   }

   public void accept(spiglet_visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(spiglet_visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(spiglet_visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(spiglet_visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

