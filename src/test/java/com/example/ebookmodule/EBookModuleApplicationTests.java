import com.example.ebookmodule.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EBookModuleApplicationTests {

	@Autowired
	private MainController mainController;

	@MockBean
	private EBookRepository eBookRepository;

//	@Test
//	void contextLoads() {
//		// Add your test logic here
//	}

//	public void testFindEbookById() {
//		// Set up mock behavior for eBookRepository
////		when(eBookRepository.findById(1)).thenReturn(Optional.of(new EBook(1, "The Great Gatsby", "F. Scott Fitzgerald", 12.99)));
//
//		Optional<EBook> optionalEBook = eBookRepository.findById(1);
//		if (optionalEBook.isPresent()) {
////			EBook ebook = optionalEBook.get();
//			// You can use 'ebook' within this block.
//			// Assertions to check the result
//			assertNotNull(optionalEBook);
//			assertEquals("The Great Gatsby", optionalEBook.getTitle());
//		} else {
//			// Handle the case when the EBook is not found (optionalEBook is empty).
//		}
//
//		// Call the Controller method
//		EBook ebook = mainController.getOneBook(1);
//
//		// Assertions to check the result
//		assertNotNull(ebook);
//		assertEquals("The Great Gatsby", ebook.getTitle());
//	}
	@Test
	public void testGetAllEBooks() {
		// Set up mock behavior for eBookRepository

		Iterable<EBook> ebooks = eBookRepository.findAll();

		// You can use 'ebook' within this block.
		// Assertions to check the result
		assertNotNull(ebooks);
	}

}
