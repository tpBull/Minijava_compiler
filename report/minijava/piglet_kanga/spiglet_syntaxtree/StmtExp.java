//
// Generated by JTB 1.3.2
//

package spiglet_syntaxtree;

import spiglet_syntaxtree.Node;
import spiglet_syntaxtree.NodeToken;

/**
 * Grammar production:
 * f0 -> "BEGIN"
 * f1 -> StmtList()
 * f2 -> "RETURN"
 * f3 -> SimpleExp()
 * f4 -> "END"
 */
public class StmtExp implements Node {
   public NodeToken f0;
   public StmtList f1;
   public NodeToken f2;
   public SimpleExp f3;
   public NodeToken f4;

   public StmtExp(NodeToken n0, StmtList n1, NodeToken n2, SimpleExp n3, NodeToken n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public StmtExp(StmtList n0, SimpleExp n1) {
      f0 = new NodeToken("BEGIN");
      f1 = n0;
      f2 = new NodeToken("RETURN");
      f3 = n1;
      f4 = new NodeToken("END");
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

