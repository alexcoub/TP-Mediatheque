/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author Alex
 */
public interface ItemVisitor {
    void visit(Book b);
    void visit(CD c);
    
}
