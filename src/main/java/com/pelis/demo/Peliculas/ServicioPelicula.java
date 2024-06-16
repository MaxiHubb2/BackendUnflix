package com.pelis.demo.Peliculas;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPelicula {

    @Autowired
    private RepositorioPelicula repositorioPelicula;

    public List<Pelicula> obtenerTodasLasPeliculas() {
        return repositorioPelicula.findAll();
    }

    public Pelicula obtenerPeliculaPorId(int id) {
        return repositorioPelicula.findById(id).orElse(null);
    }

    public Pelicula crearPelicula(Pelicula pelicula) {
        return repositorioPelicula.save(pelicula);
    }

    public Pelicula actualizarPelicula(int id, Pelicula detallesPelicula) {
        Optional<Pelicula> peliculaOptional = repositorioPelicula.findById(id);
        if (peliculaOptional.isPresent()) {
            Pelicula pelicula = peliculaOptional.get();
            pelicula.setTituloDeLaPelicula(detallesPelicula.getTituloDeLaPelicula());
            pelicula.setPoster(detallesPelicula.getPoster());
            pelicula.setAñoDeLanzamiento(detallesPelicula.getAñoDeLanzamiento());
            return repositorioPelicula.save(pelicula);
        } else {
            return null;
        }
    }

    public boolean eliminarPelicula(int id) {
        if (repositorioPelicula.existsById(id)) {
            repositorioPelicula.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public List<Pelicula> buscarPeliculasPorTitulo(String tituloDeLaPelicula) {
        return repositorioPelicula.findByTituloDeLaPeliculaContainingIgnoreCase(tituloDeLaPelicula);
    }
}

