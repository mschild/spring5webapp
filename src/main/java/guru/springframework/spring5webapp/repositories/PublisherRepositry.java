package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Publisher;

public interface PublisherRepositry extends CrudRepository<Publisher, Long> {

}