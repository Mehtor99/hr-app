package com.ajwalker.utility.data;

import com.ajwalker.entity.Comment;
import com.ajwalker.entity.User;
import com.ajwalker.repository.CommentRepository;
import com.ajwalker.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentGenerator {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CommentRepository commentRepository;
	
//	@PostConstruct
//	public void createData() {
//		createComment();
//		createUser();
//	}
//
	private void createUser() {
		User user1 = User.builder()
		                 .companyId(1L)
		                 .email("user1@gmail.com")
		                 .password("User123**")
		                 .avatar("https://cdn.prod.website-files.com/611a7bc6101f80bd34a2943b/67504416b49d5d3c41ee9d82_Semra%20Solak-p-500.png")
				.build();
		User user2 = User.builder()
		                 .companyId(2L)
		                 .email("user2@gmail.com")
		                 .password("User123**")
		                 .avatar("https://cdn.prod.website-files.com/611a7bc6101f80bd34a2943b/66f3ddef167ecc29169dc6ad_I3%20-%20FIRAT%20AYDIN-p-500.avif")
		                 .build();
		User user3 = User.builder()
		                 .companyId(3L)
		                 .email("user3@gmail.com")
		                 .password("User123**")
		                 .avatar("https://cdn.prod.website-files.com/611a7bc6101f80bd34a2943b/667bf03e84f0cb50547a84eb_ilkizalp-999x1024-p-500.avif")
		                 .build();
		User user4 = User.builder()
		                 .companyId(4L)
		                 .email("user4@gmail.com")
		                 .password("User123**")
		                 .avatar("https://cdn.prod.website-files.com/611a7bc6101f80bd34a2943b/6728b5ffef6a822ae0bce15c_deniz.demir%20(1)-p-500.avif")
		                 .build();
		User user5 = User.builder()
		                 .companyId(5L)
		                 .email("user5@gmail.com")
		                 .password("User123**")
		                 .avatar("https://cdn.prod.website-files.com/611a7bc6101f80bd34a2943b/670fae2401e2303d8dffefd8_nilay%20savas%CC%A7%20foto1-p-500.avif")
		                 .build();
		User user6 = User.builder()
		                 .companyId(6L)
		                 .email("user6@gmail.com")
		                 .password("User123**")
		                 .avatar("https://cdn.prod.website-files.com/6113889e45c6e62ebf4ca212/66c4b3df33625d8026dffd88_1674797319730.avif")
		                 .build();
		
		userRepository.saveAll(List.of(user1, user2, user3, user4, user5, user6));
		
		
	}
	
	private void createComment() {
		Comment comment1 = Comment.builder().userId(1l).companyId(1l).title("Medianova")
		                         .content("Kolay İK manuel süreçlerimizi dijital hale getirerek operasyonel yükümüzü hafifletti ve hataları minimuma indirdi. Bu dönüşüm sayesinde tüm bu süreçler için ayırdığımız zaman kısaldı; İK ekibimiz stratejik çalışmalara daha fazla odaklanma imkanı buldu.")
				.build();
		Comment comment2 = Comment.builder().userId(2l).companyId(2l).title("ISSD")
		                          .content("Artık aday başvurularını daha düzenli bir şekilde tutabiliyor ve arşivleme için ek bir çaba harcamadan hangi adayın hangi pozisyona başvurduğunu kolayca takip edebiliyoruz")
		                          .build();
		Comment comment3 = Comment.builder().userId(3l).companyId(3l).title("TurkNet")
		                          .content("Tüm görüşme notlarımızı, referans formlarımızı ve adayların hikayelerini uçtan uca takip etme imkanı bulduk.")
		                          .build();
		Comment comment4 = Comment.builder().userId(4l).companyId(4l).title("İzmir Özel Türk Koleji")
		                          .content("İşe alım süreçlerinde adayların, planlamanın, notların ve arşivin tek noktada birleşmesi iş yükümüzü önemli ölçüde azalttı.")
		                          .build();
		Comment comment5 = Comment.builder().userId(5l).companyId(5l).title("Kordsa")
				.content("İnsan kaynakları süreçlerini iyileştirme arayışında olan Kordsa, Peopleoma ile iş birliğine giderek, yalnızca bir yıl içinde 6 ülkede dijitalleştirilmiş İK süreçlerini hayata geçirdi.")
		                          .build();
		Comment comment6 = Comment.builder().userId(6l).companyId(6l).title("Medsien")
				.content("Her seviyeden çalışanın rahatlıkla kullanabileceği, İK süreçlerinin sorunsuz ve kişiden bağımsız şekilde yönetilebildiği bir platform")
				                  .build();
		
		commentRepository.saveAll(List.of(comment1, comment2, comment3, comment4, comment5, comment6));
	}
	
	
}