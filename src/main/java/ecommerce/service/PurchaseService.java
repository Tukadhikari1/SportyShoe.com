package ecommerce.service;

import java.util.List;

import org.hibernate.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
import ecommerce.dao.PurchaseDAO;
import ecommerce.entity.Purchase;

@SuppressWarnings("unused")
@Component
public class PurchaseService {

	 @Autowired
	 private PurchaseDAO purchaseDAO;

		@Transactional
		public Purchase getPurchaseById(long id) {
			return purchaseDAO.getPurchaseById(id);
		}
		
		@Transactional
		public List<Purchase> getAllItems() {
			return purchaseDAO.getAllItems();
		}			
		
		@Transactional
		public List<Purchase> getAllItemsByUserId(long userId) {
			return purchaseDAO.getAllItemsByUserId(userId);
		}	
		
		@Transactional
		public long  updatePurchase(Purchase purchase) {
			return purchaseDAO.updatePurchase(purchase);
		}
		

		@Transactional
		public void deletePurchase(Purchase id) {
			purchaseDAO.updatePurchase(id);
		}

	 
}
