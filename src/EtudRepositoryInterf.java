import java.sql.SQLException;

public interface EtudRepositoryInterf{

	boolean Exists(int matricule) throws SQLException;

	boolean Exists(String email) throws SQLException;

	
	

}
