
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="offices-menu">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h4 class="pre-header">Our Social Media Accounts:</h4>
                <a href="#" target="_blank"
                   class="btn btn-sm btn-primary">
                    <img src="https://farm360.org/assets/content/uploads/facebook.png" alt="Facebook">
                    Facebook </a>
                <a href="#" class="btn btn-sm btn-primary">
                    <img src="https://farm360.org/assets/content/uploads/instagram.png" alt="Instagram">
                    Instagram </a>
                <a href="#" class="btn btn-sm btn-primary">
                    <img src="https://farm360.org/assets/content/uploads/twitter.png" alt="Twitter">
                    Twitter </a>
            </div>
        </div>
    </div>
</nav>


<footer class="content-info" role="contentinfo">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <span class="pull-right hidden-sm">
                    <a href="https://jlawal.com/" target="_blank">
                        <span style="color:#fff">Webdesign-</span>
                    </a>
                    Houssam ATIF
                </span>
                <span class="pull-left"> © 2019 Copyright  <a style="color:#eee" href="https://jlawal.com"
                                                              target="_blank">Houssam ATIF</a> </span>
            </div>
        </div>
    </div>
</footer>


<script src="<c:url value='./views/assets/plugins/bootstrap/bootstrap.min.js' />" type="text/javascript"></script>
<script src="<c:url value='./views/assets/js/material.min.js' />"></script>
<script src="<c:url value='./views/assets/plugins/bootstrap/bootstrap-notify.js' />"></script>
<!-- Control Center for Material Kit: activating the ripples, parallax effects, scripts from the example pages etc -->
<script src="<c:url value='./views/assets/js/material-kit.min.js' />"></script>
<script src="<c:url value='./views/assets/plugins/datatables/jquery.dataTables.min.js' />"></script>
<script src="<c:url value='./views/assets/plugins/datatables/dataTables.bootstrap.min.js' />"></script>
<!-- JQuery Confirm -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.4/jquery-confirm.min.js"></script>
<script type='text/javascript' src="<c:url value='./views/assets/plugins/preloader/jquery.preloader.min.js' />"></script>
<script type='text/javascript' src="<c:url value='./views/assets/js/cart.js' />"></script>

${pageScript}


</body>
</html>

