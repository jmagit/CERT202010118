import com.example.contracts.AlumnoRepository;

module modulo.principal {
	requires modulo.domain;
	requires modulo.infraestructure;
	requires modulo.contracts;
	
	exports com.example;
	
	uses AlumnoRepository;
}