define(function(){
     
    function Project(id, name, identifier, homepage, createdOn, updatedOn, description, parentId, projectPublic){
        this.id 			= id 			|| 0;
        this.name 			= name 			|| '';
        this.identifier 	= identifier 	|| '';
        this.homepage 		= homepage 		|| '';
        this.createdOn 		= createdOn 	|| '';
        this.updatedOn 		= updatedOn 	|| '';
        this.description 	= description 	|| '';
        this.parentId 		= parentId 		|| '';
        this.projectPublic 	= projectPublic || false;
    }
     
    return Project;
});