//
// Generated by JTB 1.3.2
//

package spiglet_syntaxtree;

import spiglet_syntaxtree.Node;
import spiglet_syntaxtree.NodeToken;

/**
 * Grammar production:
 * f0 -> "MOVE"
 * f1 -> Temp()
 * f2 -> Exp()
 */
public class MoveStmt implements Node {
   public NodeToken f0;
   public Temp f1;
   public Exp f2;

   public MoveStmt(NodeToken n0, Temp n1, Exp n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public MoveStmt(Temp n0, Exp n1) {
      f0 = new NodeToken("MOVE");
      f1 = n0;
      f2 = n1;
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

