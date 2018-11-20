package com.mycompany.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.modell.Empresa;

@Repository
@Transactional
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findById(long id);
	Optional<Empresa> findByDireccion(String direccion);

}
