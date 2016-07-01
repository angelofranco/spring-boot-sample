angular.module('GreetingsApp', [])
   .controller('GreetingsController', function($scope, $http) {
       $scope.greeting = "";
       $scope.inputText = "";
       
       $scope.loadGreetingMessage = function() {
    	   $http.get("/greet-server/greet"
			).then(function mySucces(response) {
			    $scope.greeting = response.data;
			}, function myError(response) {
			});
       }
       
       $scope.onSendGreetingsClick = function() {
    	   
    	   $http.post("/greet-server/greet", {
					value : $scope.inputText
			}).then(function mySucces(response) {
			    $scope.greeting = response.data;
			}, function myError(response) {
			});
       }
       
       $scope.loadGreetingMessage();
       
});