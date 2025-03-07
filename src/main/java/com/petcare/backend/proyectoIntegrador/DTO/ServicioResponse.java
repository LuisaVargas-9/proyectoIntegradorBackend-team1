package com.petcare.backend.proyectoIntegrador.DTO;

import com.petcare.backend.proyectoIntegrador.entity.Categoria;
import com.petcare.backend.proyectoIntegrador.entity.Servicio;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ServicioResponse {
    private short idServicio;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private List<String> imagenUrls;
    private String disponibilidad;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaActualizacion;
    private boolean esBorrado;
    private LocalDateTime fechaBorrado;
    private Categoria categoria;
    private Double rating;

    public ServicioResponse(Servicio servicio) {
    }
}
