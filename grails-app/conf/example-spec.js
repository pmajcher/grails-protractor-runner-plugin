// spec.js
describe('angularjs homepage', function() {

    it('should have a title', function() {
        browser.get('http://angular.github.io/protractor');

        expect(browser.getTitle()).toEqual('Protractor - end to end testing for AngularJS');
    });
});