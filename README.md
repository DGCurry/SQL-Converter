# DSL-Assignment3

## How to run

1. First follow the guide from the lecture on how to setup Ecore, Xtend, and Xtext.
2. Install Maven.
3. Configure Maven in Eclipse: `window > preferences > maven > maven installations`.
4. Open all the projects in the root of the project.
5. Generate the code from the Ecore model in the `nl.tue.gtl.tql.model` project.
6. Run the MWE2 workflow in the `nl.tue.gtl.tql` project. If there are errors try cleaning the project: `project > clean...`
7. Now right click on `nl.tue.gtl.tql` to run it as an eclipse application.
8. Create a new project or open one of the example projects in the "examples" folder.
9. If you wish to run the generated SQL use the `nl.tue.gtl.tql.runner` project. This is a console application that executes all the generated SQl files in the "examples" folder, and outputs the results to the console.