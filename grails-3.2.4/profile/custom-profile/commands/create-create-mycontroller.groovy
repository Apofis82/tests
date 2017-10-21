import grails.util.*

description( "Creates a CreateMycontroller" ) {
    usage "grails create-create-mycontroller [NAME]"
    argument name:'CreateMycontroller Name', description:"The name of the CreateMycontroller to create", required:true
    flag name:'force', description:"Whether to overwrite existing files"
}

def model = model(args[0])
boolean overwrite = flag('force')

render template: template('commands/CreateMycontroller.groovy'),
       destination: file("grails-app/commands/${model.packagePath}/${model.simpleName}.groovy"),
       model: model,
       overwrite: overwrite
