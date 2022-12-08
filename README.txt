<h3>Simple project to test maven dependency managment</h3>

1. Transitive dependency
├── build-2
│   ├── dep-c
│   │   ├── dep-b
│   |   |    ├── dep-a
build-2 can access dep-a through dep-c

2. DependencyManagment doesn't import dependency.
It can define default version or version for child modules.
