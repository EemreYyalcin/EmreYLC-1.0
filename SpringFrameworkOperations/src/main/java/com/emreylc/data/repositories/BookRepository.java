//package com.emreylc.data.repositories;
//
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.emreylc.data.entities.Book;
//
//@Repository
//public interface BookRepository extends JpaRepository<Book, Long> {
//
//	@Transactional
//	@Modifying
//	@Query("update Book b set b.pageCount = ?2 where b.title like ?1")
//	public int setPageCount(String title, int pageCount);
//
//	// findby dan sonra where için gerekli kolon ismi yazılmalıdr
//	// bu fonksiyounun count olanı veya daha fazlası yazılabilmektedir
//	// bunlar araştırılarak kullanılabilmektedirler
//	public Book findByTitle(String title);
//
//	public List<Book> findByTitleLike(String title);
//
//	public List<Book> findByTitleContaining(String title);
//
//	public List<Book> findByTitleStartingWith(String title);
//
//	public List<Book> findByTitleEndingWith(String title);
//
//	public List<Book> findByTitleIgnoreCase(String title);
//
//	public List<Book> findByPageCountEquals(int pageCount);
//
//	public List<Book> findByPageCountGreaterThan(int pageCount);
//
//	public List<Book> findByPageCountLessThan(int pageCount);
//
//	public List<Book> findByPageCountGreaterThanEqual(int pageCount);
//
//	public List<Book> findByPageCountLessThanEqual(int pageCount);
//
//	public List<Book> findByPageCountBetween(int min, int max);
//
//	public List<Book> findByTitleContainingOrTitleContaining(String title, String title2);
//
//	public List<Book> findByTitleContainingAndPageCountGreaterThan(String title, int pageCount);
//
//	public List<Book> findByTitleNot(String title);
//
//	public List<Book> findByPublishDateAfter(Date date);
//
//	public List<Book> findByPublishDateBefore(Date date);
//
//	public List<Book> findByPublishDateBetween(Date date, Date date2);
//
//	public List<Book> findByTitleContainingOrderByTitleAsc(String title);
//
//	public List<Book> findByTitleContainingOrderByTitleDesc(String title);
//
//	public List<Book> findTopByOrderByPageCountDesc();
//
//	public List<Book> findFirstByOrderByPageCountAsc();
//
//	public List<Book> findTop5ByOrderByPriceDesc();
//
//	public List<Book> findTop5ByTitleOrderByPriceAsc(String title);
//
//	@Query("select b from Book b")
//	public List<Book> queryOne();
//
//	@Query("select b from Book b where b.pageCount > ?1")
//	public List<Book> queryTwo(int pageCount);
//
//	@Query("select b from Book b where b.title = :title")
//	public List<Book> queryThree(@Param("title") String title);
//
//	public List<Book> findByPageCountGreaterThan(int pageCount, Pageable pageable);
//
//	public List<Book> findByPageCountGreaterThan(int pageCount, Sort sort);
//
//	//onemsiz fonksiyon benzerliginden eklenmistir
//	public Page<Book> findByPageCountGreaterThan(int pageCount, Pageable pageable, int onemsiz);
//	
//	
//	
//	
//	
//}
