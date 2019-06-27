angular.module('bookLibraryApp').service('dataService', function(){
       var data;
       
       var addData = function(row){
    	   data = row;
       };
       
       var getData = function(){
               return data;
       };
    
       return {
               addData : addData,
               getData : getData
       };
       
});