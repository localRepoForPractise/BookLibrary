/**
 * Service For GET & POST CALL to backend.
 * */
 

"use strict";
(function () {

	var app = angular.module('bookLibraryApp');
	app.factory('HttpService', ['$http', '$q', '$rootScope', function ($http, $q, $rootScope) {
		var httpService = {};
		
		httpService.GET = function(url){
			var deffered = $q.defer();
			$http.get(url)
				.then(function successCallback(response) {
					deffered.resolve(response.data)
				}, function errorCallback(response) {
					deffered.reject(response);
				});
			return deffered.promise;
		}
		
		httpService.POST = function(url, postData){
			var deffered = $q.defer();
			$http.post(url, postData)
				.then(function successCallback(response) {
					deffered.resolve(response.data)
				}, function errorCallback(response) {
					deffered.reject(response);
				});
			return deffered.promise;
		}
		
		return httpService;
	}]);
}());