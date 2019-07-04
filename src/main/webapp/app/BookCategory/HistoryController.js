(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('HistoryController', function($rootScope, $scope, $http,
			HttpService, $location,$sessionStorage) {

		/** TO GET BASE URI OF APP */
		$rootScope.baseUrl = $location.$$protocol + "://" + $location.$$host
		+ ":" + $location.$$port + "/BookLibrary/";

		$scope.userDetails = $sessionStorage.userDetails;



		$scope.getData= function (){
			HttpService.POST($rootScope.baseUrl+"History","History").then(function(response){
				if(response.code ==="200"){
					console.log("success",response.data);
					$scope.HistoryBookList=[];
					$scope.HistoryBookList = response.data;
				}
				else if(response.code ==="500")
					console.log("failure",response);
			});
		};

		$scope.getData();	

		$scope.enroll = function (item){

			if($sessionStorage.userDetails!=null)
			{

				var loggedInUserID = $sessionStorage.userDetails.userId;		
				//alert(loggedInUserID);

				var enrollBookDetails =item.id;
				HttpService.POST($rootScope.baseUrl +"enroll()" + '/' + loggedInUserID + '/' + enrollBookDetails).then(function(response){
					if(response.code ==="200"){
						//console.log("success",response.data);
						alert("enroll successfull!!!");

					}
					else if(response.code ==="500")
						//console.log("failure",response);
						alert("enroll failed...Please try again");	

				});
			}

			else
			{ 
				alert("Please Login First...!")
			}
		}


	});
}());

