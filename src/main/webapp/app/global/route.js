(function () {
	'use strict';

	var routerApp = angular.module('bookLibraryApp');
	routerApp.config(function($stateProvider, $urlRouterProvider) {

		$urlRouterProvider.otherwise('/');

		$stateProvider
		.state('/', {
			url: '/',
			templateUrl : './app/global/home.html',
			//controller  : 'mainController',
			param: false
		})
		.state('/home', {
			url: '/home',
			templateUrl : './app/global/home.html',
			controller  : 'mainController',
			param: false
		})
	});
}());
