# Docker02 example

Uses Jersey, Docker, and Gradle

Has all docker operations written into the Gradle file (i.e, cleanDockerImages,
buildDockerImages, composeup, composedown).

Builds and deploys two containers, one with the application, and one with 
the storage server (in this cae MySQL).
