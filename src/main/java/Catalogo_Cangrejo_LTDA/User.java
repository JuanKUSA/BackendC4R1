/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo_Cangrejo_LTDA;

import java.io.Serializable;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author Juan Valero
 */
//@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
//@Table(name="user", indexes = @Index(name="index_email", columnList = "user_email", unique=true))
public class User implements Serializable {
    @Id
    //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @NonNull
    //  @Column(name = "user_email", nullable = false, length = 50)
    @Field(name = "user_email")
    private String email;
    @NonNull
    //  @Column(name = "user_password", nullable = false, length = 50)
    @Field(name = "user_password")
    private String password;
    @NonNull
    // @Column(name = "user_name", nullable = false, length = 80)
    @Field(name = "user_name")
    private String name;
}
