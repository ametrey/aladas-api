package ar.com.ada.api.aladas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aeropuerto")
public class Aeropuerto {

    @Id
    @Column(name = "aeropuerto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aeropuertoId;

    @Column(name = "nombre_aeropuerto")
    private String nombreAeropuerto;

    @Column(name = "codigo_iata")
    private String codigoIATA;

    
}
