package com.claro.WSCarMaintence.interfase;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.claro.WSCarMaintence.model.Mecanicos;



@Repository
@Transactional
public interface MecanicoRepository extends JpaRepository<Mecanicos,Integer>  {
	

	List<Mecanicos> findAll();

	//@Procedure("sp_crear_mecanico")
	@Query(value = "call public.sp_crear_mecanico(:in_tipo_documento,:in_documento,:in_primer_nombre,:in_segundo_nombre,:in_primer_apellido,:in_segundo_apellido,:in_celular,:in_direccion,:in_email,:in_estado)",nativeQuery = true)
	@Modifying    
	void insertMecanico(@Param("in_tipo_documento") String in_tipo_documento,
			@Param("in_documento") int in_documento,@Param("in_primer_nombre")String in_primer_nombre,
			@Param("in_segundo_nombre") String in_segundo_nombre,@Param("in_primer_apellido") String in_primer_apellido,
			@Param("in_segundo_apellido")String in_segundo_apellido, @Param("in_celular")String in_celular,
			@Param("in_direccion")String in_direccion, @Param("in_email")String in_email
			,@Param("in_estado")String in_estado 
			) throws InvalidDataAccessApiUsageException ;

	Mecanicos findByName(String string);
} 
