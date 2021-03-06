package com.onlinefurniture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlinefurniture.domain.Admin;
import com.onlinefurniture.domain.Review;
import com.onlinefurniture.domain.Seller;
import com.onlinefurniture.domain.stock.Product;
import com.onlinefurniture.domain.stock.ProductApprovedStatus;
import com.onlinefurniture.domain.stock.ProductCategory;
import com.onlinefurniture.service.SellerService;
import com.onlinefurniture.service.admin.AdminService;
import com.onlinefurniture.service.categories.CategoryService;
import com.onlinefurniture.service.products.ProductsService;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = {"*"})
public class AdminController {

    @Autowired
    ProductsService productsService;
    @Autowired
    SellerService sellerService;

    @Autowired
    AdminService adminService;

    @GetMapping("{admin_userName}/profile")
    public Admin getAdminProfile(@PathVariable String admin_userName){
        return adminService.getAdminProfile(admin_userName);
    }

    @GetMapping("/products/{id}")
    public Product approveProduct(@RequestParam("approved") boolean approved, @PathVariable long id){
        if (approved)
            return productsService.makeItApprovedOrRejected(id,"Approved");
        else
            return productsService.makeItApprovedOrRejected(id,"Rejected");
    }
    @GetMapping("/seller/{userName}")
    public Seller approveSeller(@RequestParam("approved") boolean approved, @PathVariable String userName){
        if (approved)
            return sellerService.makeItApprovedOrRejected(userName,"Approved");
        else
            return sellerService.makeItApprovedOrRejected(userName,"Rejected");
    }
    @GetMapping("/products/{id}/featured")
    public Product makeProductFeatured(@RequestParam("get") boolean featured, @PathVariable long id){
        return productsService.makeItFeatured(id,featured);
    }
    @GetMapping("reviews/{review_id}")
    public Review approveReview(@PathVariable long review_id,@RequestParam("approved") boolean approved){
        if (approved)
            return productsService.approveReview(review_id,"Approved");
        else
            return productsService.approveReview(review_id,"Rejected");

    }


    @GetMapping("/reviews")
    public List<Review> getAllReviewWithoutApproval(){
            return productsService.getAllReviewsWithoutApproval();

    }

    @Autowired
    CategoryService categoryService;
    @PostMapping("/cats")
    public ProductCategory addCats(@RequestBody ProductCategory productCategory){
        return categoryService.addCategory(productCategory);
    }
    @PutMapping("/cats/{id}")
    public ProductCategory editCat(@RequestBody ProductCategory productCategory,@PathVariable long id){
        return categoryService.editCategory(id,productCategory);
    }
    @DeleteMapping("/cats/{id}")
    public String deleteCat(@PathVariable long id){
        return categoryService.deleteCategory(id);
    }
    @GetMapping("/sellers")
    public List<Seller> getAllSellers(){
        return sellerService.getAllSellers();
    }


    @GetMapping("/sellers/{id}")
    public Seller getOneSeller(@PathVariable int id){

        return sellerService.getSellerBySId(id);
    }
//    @DeleteMapping("products/{productId}")
//    public boolean deleteProduct(@PathVariable long id){
//        return productsService.deleteProduct(id);
//    }
}
