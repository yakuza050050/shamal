package entity;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String userLogin;
    private String password;
}
