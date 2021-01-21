import com.example.contracts.AlumnoRepository;
import com.example.contracts.AlumnoRepositoryMock;

module modulo.contracts {
	requires modulo.domain;
	exports com.example.contracts;
	provides AlumnoRepository with AlumnoRepositoryMock;
}