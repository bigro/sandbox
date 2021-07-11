package graph

// This file will be automatically regenerated based on the schema, any resolver implementations
// will be copied through when generating and any unknown code will be moved to the end.

import (
	"context"
	"fmt"
	"sandbox-gqlgen/graph/generated"
	"sandbox-gqlgen/graph/model"
)

func (r *queryResolver) StationByCd(ctx context.Context, stationCd *int) (*model.Station, error) {
	lineName := "京王線"
	address := "世田谷区"
	return &model.Station{
		StationCd:   1234,
		LineName:    &lineName,
		StationName: "千歳烏山",
		Address:     &address,
	}, nil
}

func (r *queryResolver) StationByName(ctx context.Context, stationName *string) ([]*model.Station, error) {
	panic(fmt.Errorf("not implemented"))
}

// Query returns generated.QueryResolver implementation.
func (r *Resolver) Query() generated.QueryResolver { return &queryResolver{r} }

type queryResolver struct{ *Resolver }
