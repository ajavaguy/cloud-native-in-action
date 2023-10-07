package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.time.Instant;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class CatalogServiceApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

//	@Test
//	void whenPostRequestThenBookCreated() {
//		var expectedBook = new Book(null,"1234567894", "Northern Lights", "Lyra Silverstar",
//				9.90, "Vu Phan", Instant.now(), Instant.now(), 0);
//		webTestClient
//				.post()
//				.uri("/books")
//				.accept(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)
//				.bodyValue(expectedBook)
//				.exchange()
//				.expectStatus().isCreated()
//				.expectBody(Book.class).value(actualBook -> {
//					assertThat(actualBook).isNotNull();
//					assertThat(actualBook.isbn())
//							.isEqualTo(expectedBook.isbn());
//				});
//	}

}
