<!-- DataTable Bootstrap Script -->
<script src="${js}/angular.js"></script>

<!-- DataTable Bootstrap Script -->
<script src="${js}/productsController.js"></script>
<div class="container" ng-app="ShoppingApp" ng-controller="ProductController as pCtrl" >

	<div class="row" ng-init="pCtrl.fetchProducts()">

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<div class="col-md-9">

			

				<div class="row">
                	<div class="col-xs-12">
                		<h3>Select your base currency</h3>
                		<hr/>
                		<select id = "currencies" class="form-select" aria-label="Default select example">
							  <option value ="USD">USD</option>
							  <option value="CAD">CAD</option>
							  <option value="INR">INR</option>
						</select>
						<hr/>
                	</div>
                	<div class="col-xs-12">
                	 <div class="col-xs-6">
                	 <h4 class="greeting-id">Your Base is: </h4>
            		</div>   
            		<div class="col-xs-6">
                	 <h4 class="greeting-content">AFN rate is: </h4>
            		</div>          		
            		</div>
                </div>
		</div>

	</div>

</div>
<!-- /.container -->
