/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Catalogo_Cangrejo_LTDA;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.repository.CrudRepository;
 
/**
 *
 * @author Juan Valero
 */
public interface UserCrudRepository extends MongoRepository <User, String> {
        //CrudRepository <User, Integer> {
    @Query("{email:?0}")
    Optional<User> findByEmail(String email);
    @Query("{email:?0, password:?1}")
    Optional<User> findByEmailAndPassword(String email,String password);
     
}
