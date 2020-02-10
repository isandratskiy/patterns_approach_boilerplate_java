package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserModel {
	@Builder.Default
	@JsonProperty("firstName")
	private String firstName = "Micky";

	@Builder.Default
	@JsonProperty("lastName")
	private String lastName = "Mouse";

	@Builder.Default
	@JsonProperty("strategy")
	private String strategy = "Strategy";
}