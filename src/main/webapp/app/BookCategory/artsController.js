/**
 * 
 */


(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('artsController', function($rootScope, $scope,$sessionStorage,
			HttpService, $location) {

		/** TO GET BASE URI OF APP */
		$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
		+ ":" + $location.$$port + "/BookLibrary/";

		$scope.getData= function (){
			HttpService.POST($rootScope.baseUrl+"arts","arts").then(function(response){
				if(response.code ==="200"){
					console.log("success",response.data);
					$scope.artsBookList=[];
					$scope.artsBookList = response.data;
				}
				else if(response.code ==="500")
					console.log("failure",response);
			});
		};

		$scope.getData();

		$scope.enroll = function(item){
			// alert(item.id + "" + item.bookName + "" + item.bookAuthor);  				 

			if($sessionStorage.userDetails != null)
			{
				//Take User id from session
				var loggedInUserID = $sessionStorage.userDetails.userId;		
				//alert(loggedInUserID);

				var enrollBookDetails =item.id;

				HttpService.POST($rootScope.baseUrl +"arts" + '/' + loggedInUserID + '/' + enrollBookDetails).then(function(response){
					if(response.code ==="200"){
						//console.log("success",response.data);					
						alert("Book enrolled successfully!!!");
					}
					else if(response.code ==="500")
						//console.log("failure",response);
						alert("Oops...Something went wrong please try again!!!");

				});
			}
			else
			{
				alert("Please Login to enroll the books!!!");
				$location.path("login");
			}
		}		
	});
}());
