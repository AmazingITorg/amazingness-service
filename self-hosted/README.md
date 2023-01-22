### Setup the self-hosted runner. For more infos check the [Actions Runner Controller Quickstart](https://github.com/actions/actions-runner-controller/blob/master/docs/quickstart.md):

- Install cert manager kubectl apply -f https://github.com/cert-manager/cert-manager/releases/download/v1.8.2/cert-manager.yaml

- Install actions-runner-controller and replace with github token on the placeholder:

`helm upgrade --install --namespace actions-runner-system --create-namespace\
  --set=authSecret.create=true\
  --set=authSecret.github_token="REPLACE_YOUR_TOKEN_HERE"\
  --wait actions-runner-controller actions-runner-controller/actions-runner-controller`

- Create service account, role and role-binding for creating argocd applications:

`kubectl apply -f self-hosted/argo-role.yaml`

`kubectl apply -f self-hosted/ service-account.yaml`

`kubectl apply -f self-hosted/role-binding.yaml`

- Create the GitHub self hosted runners and configure to run against your repository:

`kubectl apply -f self-hosted/ self-hosted-runner.yaml`
