/**
 * Router Configuration.
 */

(function () {
	'use strict';

	var routerApp = angular.module('bookLibraryApp');
	routerApp.config(function($stateProvider, $urlRouterProvider) {

		$stateProvider
		.state('/', {
			url: '/',
			templateUrl : './app/global/home.html',
			//controller  : 'mainController',
		})
		.state('/home', {
			url: '/home',
			templateUrl : './app/global/home.html',
			//controller  : 'mainController',
		})
		.state('/test', {
			url: '/test',
			templateUrl : './app/global/test.html',
		})
		.state('/UserBookHistory', {
			url: '/UserBookHistory',
			templateUrl : './app/global/UserBookHistory.html',
			//controller  : 'mainController',
		})
		
		$urlRouterProvider.otherwise('/');
	});
}());
