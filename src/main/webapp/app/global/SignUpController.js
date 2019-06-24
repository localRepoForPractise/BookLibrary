
/**
* Main Controller of Book Library App
*/
function check() {
            if(document.getElementById('password').value ===
                    document.getElementById('confirm_password').value) {
                document.getElementById('message').innerHTML = "";
            } else {
                document.getElementById('message').innerHTML = "plz enter confirm password same as password";
            }
}
(function() {

	var app = angular.module('bookLibraryApp');
	app.controller('signUpController',function($rootScope, $scope, $http, HttpService, $location) {
			
		
		
		
		/** TO GET BASE URI OF APP*/
		$rootScope.baseUrl = $location.$$protocol + "://"+$location.$$host + ":"+$location.$$port + "/BookLibrary/";
		$scope.connection='';

		$scope.signUp = {
				um : '',
				pwd : '',
				em :'',
		};
		var FromDate ;
		var date = new Date();
		FromDate = date.getFullYear() + '-' + ( (date.getMonth() + 1)) + '-' + ( date.getDate());
      $scope.pass= function (){
	
			
			var reqData = {
					username :$scope.signUp.um,
					create_by:$scope.signUp.um,
			        password:$scope.signUp.pwd,
			        email:$scope.signUp.em,
			        create_date :FromDate
			      
			};
			HttpService.POST($rootScope.baseUrl + 'SignUp',reqData).then(
					function successCallback(response) {
						if(response.code==="200")
							console.log("SUCCESS");
						else if(response.code==="500")
							console.log("FAILURE");
						
						/**console.log("Connection: ", response);*/
						//$scope.connection = "Connection: " + response.message;
					});
					}
      //fecthing data:
     /* $scope.displayData= function (){
			HttpService.GET($rootScope.baseUrl+"SignUp").then(function(response){
				if(response.code ==="200"){
					console.log("success",response.data);
					$scope.userList=[];
					$scope.userList = response.data;
				}
				else if(response.code ==="500")
					console.log("failure",response);
			});
		};
		
		$scope.displayData();*/
	});
}());