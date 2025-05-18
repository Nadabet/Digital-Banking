package ma.enset.digitalbanking.dtos;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;
import ma.enset.digitalbanking.Entities.BankAccount;
import java.util.List;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
