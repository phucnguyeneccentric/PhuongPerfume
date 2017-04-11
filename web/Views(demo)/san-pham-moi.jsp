<%-- 
    Document   : san-pham-moi
    Created on : Apr 10, 2017, 10:11:58 AM
    Author     : hv
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <div class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title">Sản phẩm mới</h2>
                        <div class="product-carousel">
                            <c:forEach items="${dsspm}" var="spm">
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/${spm.hinhAnh}" alt="">
                                    <div class="product-hover">
                                        <a href="ThemGioHangServlet?id=${spm.id}" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Thêm vào giỏ</a>
                                        <a href="trang-san-pham.jsp?id=${spm.id}" class="view-details-link"><i class="fa fa-link"></i> Xem chi tiết</a>
                                    </div>
                                </div>
                                
                                <h2><a href="trang-san-pham.jsp?id=${spm.id}">${spm.tenSanPham}</a></h2>
                                
                                <div class="product-carousel-price">
                                    <ins>${spm.donGiaKM}</ins> <del>${spm.donGia}</del>
                                </div> 
                            </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End main content area -->
    