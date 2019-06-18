
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
	app.controller('signUpController', function($rootScope, $scope, $http, HttpService, $location) {
			
		
		
		
		/** TO GET BASE URI OF APP*/
		$rootScope.baseUrl = $location.$$protocol + "://"+$location.$$host + ":"+$location.$$port + "/BookLibrary/";
		$scope.connection='';

		$scope.signUp = {
				um : '',
				pwd : '',
				em :'',
				cpwd:''
		};
      $scope.pass= function (){
	
			//var reqData=um;
			var reqData = {
					Username :$scope.signUp.um,
					 Email:$scope.signUp.em,
			      password:$scope.signUp.pwd,
			      created_by:$scope.signUp.um
			     // User_type=Null;
			      //created_date=CURDATE();
			      
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
	});
}());