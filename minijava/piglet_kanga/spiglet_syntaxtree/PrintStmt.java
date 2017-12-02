//
// Generated by JTB 1.3.2
//

package spiglet_syntaxtree;

import spiglet_syntaxtree.Node;
import spiglet_syntaxtree.NodeToken;

/**
 * Grammar production:
 * f0 -> "PRINT"
 * f1 -> SimpleExp()
 */
public class PrintStmt implements Node {
   public NodeToken f0;
   public SimpleExp f1;

   public PrintStmt(NodeToken n0, SimpleExp n1) {
      f0 = n0;
      f1 = n1;
   }

   public PrintStmt(SimpleExp n0) {
      f0 = new NodeToken("PRINT");
      f1 = n0;
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

