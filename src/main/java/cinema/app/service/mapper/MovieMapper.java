package cinema.app.service.mapper;

import cinema.app.dto.request.MovieRequestDto;
import cinema.app.dto.response.MovieResponseDto;
import cinema.app.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper implements RequestDtoMapper<MovieRequestDto, Movie>,
        ResponseDtoMapper<MovieResponseDto, Movie> {
    @Override
    public Movie mapToModel(MovieRequestDto dto) {
        Movie movie = new Movie();
        movie.setTitle(dto.getMovieTitle());
        movie.setDescription(dto.getMovieDescription());
        return movie;
    }

    @Override
    public MovieResponseDto mapToDto(Movie movie) {
        MovieResponseDto responseDto = new MovieResponseDto();
        responseDto.setMovieId(movie.getId());
        responseDto.setMovieTitle(movie.getTitle());
        responseDto.setMovieDescription(movie.getDescription());
        return responseDto;
    }
}
