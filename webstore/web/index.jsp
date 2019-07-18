
<%@ include file="./views/pages/pages/templates/head.jsp" %>
<%@ include file="./views/pages/pages/templates/header.jsp" %>


<div class="page-header header-filter header-small"
     style="background-image: url('<c:url value='./views/assets/images/banner.png'/>');">
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2 text-center">
                <div class="brand">
                    <h1 class="title">Technology</h1>
                    <h4>Smart phones and social media expand our universe.</h4>
                    <div>
                        <form class="navbar-form" role="search" method="get" action="<c:url value='/search'/>">
                            <div class="form-group form-white is-empty">
                                <input id="homesearch" type="text" class="form-control" required="" placeholder="Search for Products" name="product" style="color:#FFF;text-align: center;">
                                <span class="material-input"></span></div>
                            <button type="submit" class="btn btn-white btn-raised btn-fab btn-fab-mini"><i class="material-icons">search</i></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>


    </div>
</div>

<div id="categories">
    <div class="section">
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <h2 class="section-title" style="text-transform:capitalize;"><a class="text text-success" href="#">Latest
                        Products</a></h2>

                </div>
            </div>
            <%@ include file="./views/pages/pages/templates/productlist.jsp" %>



        </div>
    </div><!-- section -->
</div>
