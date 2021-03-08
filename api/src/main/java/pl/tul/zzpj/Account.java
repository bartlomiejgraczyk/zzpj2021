package pl.tul.zzpj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    
    private Long id;

    @NonNull
    private String email;
    private String firstName;
    private String lastName;
    @NonNull
    private String password;
}
