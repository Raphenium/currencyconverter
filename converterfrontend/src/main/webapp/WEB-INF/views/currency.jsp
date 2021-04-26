<div class="container">

	<div class="row">


		<!-- Would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display the actual products -->
		<div class="col-md-9">

			<!-- Added breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">

					<c:if test="${currency == true}">
					
						<script>
							window.categoryId = '';
						</script>
					
						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>


						</ol>
					</c:if>
					
					
				<!-- 	
				<select id = "currencies" class="form-select" aria-label="Default select example">
				  <option value ="USD">USD</option>
				  <option value="CAD" selected>CAD</option>
				  <option value="INR">INR</option>
				</select> -->
					
					

				</div>


			</div>

			
			<div class="row">
			
				<div class="col-xs-12">
				
					
           <!--  <p class="greeting-id">The ID is </p>
            <p class="greeting-content">The content is </p> -->
        
				
				</div>
			
			</div>


		</div>



	</div>






</div>
