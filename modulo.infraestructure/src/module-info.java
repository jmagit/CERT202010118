import com.example.contracts.AlumnoRepository;
import com.example.repositories.AlumnoRepositoryImp;

module modulo.infraestructure {
	requires transitive modulo.domain;
	requires modulo.contracts;
	
	exports com.example.repositories;
	provides AlumnoRepository with AlumnoRepositoryImp;
}