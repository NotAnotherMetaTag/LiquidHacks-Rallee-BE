package liquidhacks.rallee.ralleebe.model;

import java.util.UUID;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBGeneratedUuid;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;

@DynamoDBTypeConverted(converter = ObjectConverter.class)
@DynamoDBTable(tableName = "User")
public class UserDTO
{
	private UUID id;
	private String username;
	private String password;

	public UserDTO() {

	}

	@DynamoDBHashKey
	@DynamoDBGeneratedUuid(DynamoDBAutoGenerateStrategy.CREATE)
	public UUID getId() {
		return id;
	}

	@DynamoDBAttribute
	public String getUsername() {
		return username;
	}

	@DynamoDBAttribute
	public String getPassword() {
		return password;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}